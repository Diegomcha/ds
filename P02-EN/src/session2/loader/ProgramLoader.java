package session2.loader;

import session2.instruction.*;
import session2.vm.Instruction;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProgramLoader {

    private final static Stream<Supplier<Instruction>> SUPPORTED_INSTRUCTIONS = Stream
            .of(
                    AddInstruction::new,
                    InputInstruction::new,
                    JmpgInstruction::new,
                    JmpInstruction::new,
                    LoadInstruction::new,
                    MulInstruction::new,
                    OutputInstruction::new,
                    PushInstruction::new,
                    StoreInstruction::new,
                    SubInstruction::new
                    // Add new instructions here
            );

    private final static Map<String, Supplier<Instruction>> INSTRUCTION_MAP = SUPPORTED_INSTRUCTIONS
            .collect(Collectors.toMap(i -> i.get().getId(), i -> i));

    public static List<Instruction> loadProgram(String filename) {
        List<Instruction> list = new ArrayList<>();
        String line;

        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {
            while ((line = file.readLine()) != null) {
                if (validateLine(line)) list.add(parseInstruction(line));
            }
        } catch (FileNotFoundException e) {
            System.err.println("ERROR! File not found: " + filename);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("ERROR! IO Exception occurred");
            throw new RuntimeException(e);
        }

        return list;
    }

    private static boolean validateLine(String line) {
        return !line.trim().isEmpty();
    }

    private static Instruction parseInstruction(String rawInstruction) {
        List<String> parts = new ArrayList<>(List.of(rawInstruction.trim().split(" ")));
        return ProgramLoader.INSTRUCTION_MAP.get(parts.removeFirst()).get().setArgs(parts);
    }
}
