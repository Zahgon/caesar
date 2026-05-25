package com.github.vbauer.caesar.runner.impl.base;

import com.github.vbauer.caesar.util.ReflectionUtils;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.Callable;

/**
 * @author Vladislav Bauer
 */
public abstract class AbstractCallbackMethodRunner extends AbstractAsyncMethodRunner {

    /**
     * {@inheritDoc}
     */
    @Override
    public <T> Callable<T> createCall(final Object origin, final Method syncMethod, final Object[] args) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected Method findSyncMethod(final Class<?> targetClass, final String methodName, final Class<?> returnType, final Class<?>[] parameterTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract <T> Callable<T> createCall(Object origin, Method syncMethod, Object callback, Object[] args);

    protected abstract Class<?> getCallbackClass();
}
