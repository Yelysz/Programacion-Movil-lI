package com.example.makeitso.model.service.impl;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class LogServiceImpl_Factory implements Factory<LogServiceImpl> {
  @Override
  public LogServiceImpl get() {
    return newInstance();
  }

  public static LogServiceImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static LogServiceImpl newInstance() {
    return new LogServiceImpl();
  }

  private static final class InstanceHolder {
    private static final LogServiceImpl_Factory INSTANCE = new LogServiceImpl_Factory();
  }
}
