package com.github.vbauer.caesar.util;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Vladislav Bauer
 */
@SuppressWarnings("unchecked")
public final class ReflectionUtils {

    public static final String PACKAGE_SEPARATOR = ".";

    private ReflectionUtils() {
        throw new UnsupportedOperationException();
    }

    public static <T> Class<T> getClassWithoutProxies(final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Class<T> getClassSafe(final Object object) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> T createObject(final String className) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T> Collection<T> createObjects(final Collection<String> classNames) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Collection<String> classNames(final String packageName, final Collection<String> classNames) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Method findDeclaredMethod(final Class<?> objectClass, final String methodName, final Class<?>[] parameterTypes) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T extends Annotation> T findAnnotationFromMethodOrClass(final Method method, final Class<T> annotationClass) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
