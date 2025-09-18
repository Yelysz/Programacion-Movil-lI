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
public final class ConfigurationServiceImpl_Factory implements Factory<ConfigurationServiceImpl> {
  @Override
  public ConfigurationServiceImpl get() {
    return newInstance();
  }

  public static ConfigurationServiceImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ConfigurationServiceImpl newInstance() {
    return new ConfigurationServiceImpl();
  }

  private static final class InstanceHolder {
    private static final ConfigurationServiceImpl_Factory INSTANCE = new ConfigurationServiceImpl_Factory();
  }
}
