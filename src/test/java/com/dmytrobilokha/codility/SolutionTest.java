package com.dmytrobilokha.codility;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

@Test(groups = "unit")
public class SolutionTest {

    private Solution solution = new Solution();

    @DataProvider(name = "binary-provider")
    public Object[][] dataProvider() {
        return new Object[][]{
                {0b1, 0}
                , {0, 0}
                , {0b101, 1}
                , {0b111, 0}
                , {0b10010001, 3}
                , {0b1000010001, 4}
                , {0b11001101, 2}
        };
    }

    @Test(dataProvider = "binary-provider")
    public void findsSolution(int input, int output) {
        assertEquals(solution.solution(input), output);
    }

}
