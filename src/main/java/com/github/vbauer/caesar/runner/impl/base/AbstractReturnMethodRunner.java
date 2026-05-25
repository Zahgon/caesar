package com.github.vbauer.caesar.runner.impl.base;

import com.github.vbauer.caesar.util.ReflectionUtils;
import java.lang.reflect.Method;
import java.util.Objects;

/**
 * {@link AbstractAsyncMethodRunner}
 *
 * @author Vladislav Bauer
 */
public abstract class AbstractReturnMethodRunner extends AbstractAsyncMethodRunner {

    /**
     * {@inheritDoc}
     */
    @Override
    protected Method findSyncMethod(final Class<?> targetClass, final String methodName, final Class<?> returnType, final Class<?>[] parameterTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract Class<?> getReturnClass(Class<?> originReturnType);
}
