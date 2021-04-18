package org.example.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PositionValidatorTest {

    @Test
    void validatePosition_invalidRowInput_validatorPositionFalseOutput() {
        assertFalse(PositionValidator.validatePosition("T3"));
    }

    @Test
    void validatePosition_invalidColumnInput_validatorPositionFalseOutput() {
        assertFalse(PositionValidator.validatePosition("D9"));
    }

    @Test
    void validatePosition_invalidRowAndColumnInput_validatorPositionFalseOutput() {
        assertFalse(PositionValidator.validatePosition("T9"));
    }

    @Test
    void validatePosition_invalidColumnAsRowInput_validatorPositionFalseOutput() {
        assertFalse(PositionValidator.validatePosition("TT"));
    }

    @Test
    void validatePosition_invalidRowAsColumnInput_validatorPositionFalseOutput() {
        assertFalse(PositionValidator.validatePosition("33"));
    }

    @Test
    void validatePosition_validRowColumnInput_validatorPositionTrueOutput() {
        assertTrue(PositionValidator.validatePosition("D3"));
    }


}