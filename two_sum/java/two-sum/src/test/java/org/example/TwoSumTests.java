package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class TwoSumTests {

    private TwoSum twoSum;

    @BeforeEach
    public void beforeEach() {
        twoSum = new TwoSum();
    }

    public static Stream<Arguments> shouldData() {
        return Stream.of(
            Arguments.of(new int[]{2, 7, 11, 15}, 9, new int[]{0, 1}),
            Arguments.of(new int[]{3, 2, 4}, 6, new int[]{1, 2}),
            Arguments.of(new int[]{3, 3}, 6, new int[]{0, 1}),
            Arguments.of(
                new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2},
                4,
                new int[]{20, 21}),
            Arguments.of(new int[]{1, 2, 4, 4, 5}, 8, new int[] {2, 3})
        );
    }

    @ParameterizedTest
    @MethodSource("shouldData")
    public void should(int[] numbers, int sum, int[] expectedResult) {

        // Act
        int[] result = twoSum.twoSum(numbers, sum);

        // Assert
        assertThat(result).isEqualTo(expectedResult);
    }
}
