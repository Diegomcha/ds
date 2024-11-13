package survey.out.filter;

import survey.Question;
import survey.out.Output;

public class DelayFilter implements Output {

	private int count = 0;

	private final int targetCount;
	private final Output filteredOutput;

	public DelayFilter(int targetCount, Output filteredOutput) {
		this.targetCount = targetCount;
		this.filteredOutput = filteredOutput;
	}

	@Override
	public void update(Question question) {
		if (++count >= this.targetCount) {
			this.filteredOutput.update(question);
		}
	}

}
