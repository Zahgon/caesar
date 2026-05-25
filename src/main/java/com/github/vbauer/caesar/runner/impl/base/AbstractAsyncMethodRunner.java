package com.github.vbauer.caesar.runner.impl.base;

import com.github.vbauer.caesar.runner.AsyncMethodRunner;
import com.github.vbauer.caesar.runner.task.SimpleInvokeTask;
import com.github.vbauer.caesar.util.ReflectionUtils;
import java.lang.reflect.Method;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @author Vladislav Bauer
 */
public abstract class AbstractAsyncMethodRunner implements AsyncMethodRunner {

    /**
     * {@inheritDoc}
     */
    @Override
    public final Method findSyncMethod(final Object origin, final Method asyncMethod) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

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
    public Object processResultFuture(final Future<?> future, final ExecutorService executor) throws Throwable {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract Method findSyncMethod(Class<?> targetClass, String methodName, Class<?> returnType, Class<?>[] parameterTypes);
}
