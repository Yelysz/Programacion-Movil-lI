package com.example.makeitso.screens.tasks;

import com.example.makeitso.model.service.ConfigurationService;
import com.example.makeitso.model.service.LogService;
import com.example.makeitso.model.service.StorageService;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class TasksViewModel_Factory implements Factory<TasksViewModel> {
  private final Provider<LogService> logServiceProvider;

  private final Provider<StorageService> storageServiceProvider;

  private final Provider<ConfigurationService> configurationServiceProvider;

  public TasksViewModel_Factory(Provider<LogService> logServiceProvider,
      Provider<StorageService> storageServiceProvider,
      Provider<ConfigurationService> configurationServiceProvider) {
    this.logServiceProvider = logServiceProvider;
    this.storageServiceProvider = storageServiceProvider;
    this.configurationServiceProvider = configurationServiceProvider;
  }

  @Override
  public TasksViewModel get() {
    return newInstance(logServiceProvider.get(), storageServiceProvider.get(), configurationServiceProvider.get());
  }

  public static TasksViewModel_Factory create(Provider<LogService> logServiceProvider,
      Provider<StorageService> storageServiceProvider,
      Provider<ConfigurationService> configurationServiceProvider) {
    return new TasksViewModel_Factory(logServiceProvider, storageServiceProvider, configurationServiceProvider);
  }

  public static TasksViewModel newInstance(LogService logService, StorageService storageService,
      ConfigurationService configurationService) {
    return new TasksViewModel(logService, storageService, configurationService);
  }
}
