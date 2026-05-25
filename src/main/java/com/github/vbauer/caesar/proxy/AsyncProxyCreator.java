package com.github.vbauer.caesar.proxy;

import com.github.vbauer.caesar.exception.MissedSyncMethodException;
import com.github.vbauer.caesar.runner.AsyncMethodRunner;
import com.github.vbauer.caesar.util.ReflectionUtils;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.ExecutorService;

/**
 * Proxy creator that makes asynchronous variant of bean.
 *
 * @author Vladislav Bauer
 */
public final class AsyncProxyCreator {

    private AsyncProxyCreator() {
        throw new UnsupportedOperationException();
    }

    public static <SYNC, ASYNC> ASYNC create(final SYNC bean, final Class<ASYNC> asyncInterface, final ExecutorService executor) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public static <SYNC, ASYNC> ASYNC create(final SYNC bean, final Class<ASYNC> asyncInterface, final ExecutorService executor, final boolean validate) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private static <T> T validate(final T proxy, final AsyncInvocationHandler handler) {
        final Class<?> targetClass = ReflectionUtils.getClassWithoutProxies(proxy);
        final Method[] methods = targetClass.getDeclaredMethods();
        for (final Method method : methods) {
            final AsyncMethodRunner runner = handler.findAsyncMethodRunner(method);
            if (runner == null) {
                throw new MissedSyncMethodException(method);
            }
        }
        return proxy;
    }
}
