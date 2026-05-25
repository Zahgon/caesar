package com.github.vbauer.caesar.callback;

/**
 * {@link AsyncCallback}
 *
 * @param <T> type of result
 * @author Vladislav Bauer
 */
public class AsyncCallbackAdapter<T> implements AsyncCallback<T> {

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
    public void onFailure(final Throwable caught) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
