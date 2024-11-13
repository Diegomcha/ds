package survey.out.filter;

import survey.Question;
import survey.out.Output;

public class PeriodicFilter implements Output {

	private int count = 0;

	private final int periodCount;
	private final Output filteredOutput;

	public PeriodicFilter(int periodCount, Output filteredOutput) {
		this.periodCount = periodCount;
		this.filteredOutput = filteredOutput;
	}

	@Override
	public void update(Question question) {
		if (count++ % periodCount == 0) {
			this.filteredOutput.update(question);
		} 
	}

}
