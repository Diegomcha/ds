package main;

import vm.VirtualMachine;
import vm.instruction.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        new VirtualMachine(loadProgram("program.txt"), getSupportedInstructions()).executeProgram();
    }

    private static Map<String, Instruction> getSupportedInstructions() {
        HashMap<String, Instruction> instructions = new HashMap<>();
        instructions.put("add", new AddInstruction());
        instructions.put("input", new InputInstruction());
        instructions.put("jmpg", new JmpgInstruction());
        instructions.put("jmp", new JmpInstruction());
        instructions.put("load", new LoadInstruction());
        instructions.put("mul", new MulInstruction());
        instructions.put("output", new OutputInstruction());
        instructions.put("push", new PushInstruction());
        instructions.put("store", new StoreInstruction());
        instructions.put("sub", new SubInstruction());
        return instructions;
    }

    private static List<String[]> loadProgram(String filename) {
        List<String[]> list = new ArrayList<>();
        String line;

        try (BufferedReader file = new BufferedReader(new FileReader(filename))) {

            while ((line = file.readLine()) != null)
                if (!line.trim().isEmpty())
                    list.add(line.trim().split(" "));

        } catch (FileNotFoundException e) {
            System.err.println("ERROR! File not found: " + filename);
            System.exit(1);
        } catch (IOException e) {
            System.err.println("ERROR! IO Exception occurred");
            throw new RuntimeException(e);
        }

        return list;
    }

}
