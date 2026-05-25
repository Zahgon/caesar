package com.github.vbauer.caesar.exception;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/**
 * @author Vladislav Bauer
 */
@SuppressWarnings("serial")
public class UnsupportedTimeoutException extends AbstractCaesarException {

    private final Executor executor;

    public UnsupportedTimeoutException(final Executor executor) {
        this.executor = executor;
    }

    public Executor getExecutor() {
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
