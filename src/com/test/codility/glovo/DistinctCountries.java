package com.test.codility.glovo;

public class DistinctCountries {

    public static void main(String[] args) {
        int[][] counties = new int[7][3];

        counties[0][0] = 5;
        counties[0][1] = 4;
        counties[0][2] = 4;

        counties[1][0] = 4;
        counties[1][1] = 3;
        counties[1][2] = 4;

        counties[2][0] = 3;
        counties[2][1] = 2;
        counties[2][2] = 4;

        counties[3][0] = 2;
        counties[3][1] = 2;
        counties[3][2] = 2;

        counties[4][0] = 3;
        counties[4][1] = 3;
        counties[4][2] = 4;

        counties[5][0] = 1;
        counties[5][1] = 4;
        counties[5][2] = 4;

        counties[6][0] = 4;
        counties[6][1] = 1;
        counties[6][2] = 1;

        calculate(counties);
    }

    private static int calculate(int[][] countries) {
        int count = 0;
        int rows = countries.length;
        int cols = countries[0].length;
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                int color = countries[i][j];
                int north = get(countries, i-1, j);
                int south = get(countries, i+1, j);
                int east = get(countries, i, j+1);
                int west = get(countries, i, j-1);

                if(north == 0 && east == 0) {
                    if(!(color == south && color == west)) count++;
                } else if (north == 0 && west == 0) {
                    if(!(color == south && color == east)) count++;
                } else if(south == 0 && east == 0) {
                    if(!(color == north && color == west)) count++;
                } else if(south == 0 && west == 0) {
                    if(!(color == north && color == east)) count++;
                } else if (north == 0) {
                    if(!(color == east || color == south || color == west)) count++;
                } else if (south == 0) {
                    if(!(color == north || color == east || color == west)) count++;
                } else if (east == 0) {
                    if(!(color == north || color == south || color == west)) count++;
                } else if (west == 0) {
                    if(!(color == east || color == south || color == west)) count++;
                } else {
                    if(!(color == north && color == south && color == east && color == west)) count++;
                }
            }
        }

        System.out.println(count);
        return 0;
    }

    private static int get(int[][] countries, int i, int j) {
        try {
            if (!(i < 0 || j > countries[0].length)) return countries[i][j];
            else return 0;
        } catch (ArrayIndexOutOfBoundsException exception) {
            return 0;
        }
    }
}
