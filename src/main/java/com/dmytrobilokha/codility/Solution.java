package com.dmytrobilokha.codility;

class Solution {

    public int solution(int input) {
        int maximumGap = 0;
        int currentGap = 0;
        boolean previousBit = false;
        boolean insideGap = false;
        for (int shiftedN = input; shiftedN > 0; shiftedN = shiftedN >> 1) {
            boolean currentBit = (shiftedN & 1) != 0;
            boolean newInsideGap = !currentBit && insideGap || !currentBit && previousBit;
            if (insideGap && !newInsideGap) {
                maximumGap = Math.max(maximumGap, currentGap);
                currentGap = 0;
            }
            if (newInsideGap) {
                currentGap++;
            }
            insideGap = newInsideGap;
            previousBit = currentBit;
        }
        return maximumGap;
    }

}
