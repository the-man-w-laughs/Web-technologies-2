package by.tc.task01.service.validation.impl;

import by.tc.task01.entity.enums.FilterType;
import by.tc.task01.service.validation.ValueValidator;

/**
 * Represent value validator for filter type
 */
public class FilterTypeValidator implements ValueValidator {
    /**
     * {@inheritDoc}
     */
    @Override
    public boolean validate(Object obj) {
        try {
            FilterType.valueOf((String) obj);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
