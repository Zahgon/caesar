package com.github.vbauer.caesar.callback;

import com.google.common.util.concurrent.FutureCallback;

/**
 * {@link FutureCallback}
 *
 * @param <T> type of result
 * @author Vladislav Bauer
 */
public class FutureCallbackAdapter<T> implements FutureCallback<T> {

    /**
     * {@inheritDoc}
     */
    @Override
    public void onSuccess(final T result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void onFailure(final Throwable t) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
