package baseball.model;

import java.util.List;

public class Player {
    private BaseballNumber baseballNumber;

    public List<Integer> getBaseballNumber() {
        return baseballNumber.getBaseballNumberList();
    }

    public void updateBaseballNumber(BaseballNumber baseballNumber) {
        this.baseballNumber = baseballNumber;
    }
}
