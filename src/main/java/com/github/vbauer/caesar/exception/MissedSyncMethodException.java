package com.github.vbauer.caesar.exception;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * @author Vladislav Bauer
 */
@SuppressWarnings("serial")
public class MissedSyncMethodException extends AbstractCaesarException {

    private final Method method;

    private final Object[] arguments;

    public MissedSyncMethodException(final Method method, final Object... arguments) {
        this.method = method;
        this.arguments = arguments;
    }

    public Method getMethod() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Object[] getArguments() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getMessage() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
