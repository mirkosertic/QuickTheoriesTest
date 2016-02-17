package de.mirkosertic.quicktheories;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.quicktheories.quicktheories.QuickTheory.*;
import static org.quicktheories.quicktheories.generators.SourceDSL.*;

public class ComputerTest {

    @Test
    public void testComputer() {
        Computer theComputer = new Computer();
        qt().forAll(integers().allPositive(), integers().allPositive()).check((i, j) -> theComputer.add(i, j) == i + j);
    }
}