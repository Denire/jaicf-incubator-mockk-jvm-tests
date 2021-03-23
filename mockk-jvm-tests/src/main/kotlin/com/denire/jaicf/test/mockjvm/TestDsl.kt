package com.denire.jaicf.test.mockjvm

@Target(
    AnnotationTarget.CLASS, AnnotationTarget.TYPE, AnnotationTarget.FUNCTION,
    AnnotationTarget.PROPERTY,
    AnnotationTarget.VALUE_PARAMETER
)
@DslMarker
annotation class TestDsl