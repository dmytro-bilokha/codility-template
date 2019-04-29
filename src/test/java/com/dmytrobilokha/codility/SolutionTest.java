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
                {new int[]{1, 2, 1}, 2}
                , {new int[]{1, 2, 2}, 1}
        };
    }

    @Test(dataProvider = "binary-provider")
    public void findsSolution(int[] input, int output) {
        assertEquals(solution.solution(input), output);
    }

}
