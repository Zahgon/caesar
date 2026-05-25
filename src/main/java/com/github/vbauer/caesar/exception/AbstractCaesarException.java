package com.github.vbauer.caesar.exception;

/**
 * @author Vladislav Bauer
 */
@SuppressWarnings("serial")
public abstract class AbstractCaesarException extends RuntimeException {

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
