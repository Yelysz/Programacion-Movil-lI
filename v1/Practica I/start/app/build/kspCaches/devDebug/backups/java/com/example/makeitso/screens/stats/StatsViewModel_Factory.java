package com.example.makeitso.screens.stats;

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
public final class StatsViewModel_Factory implements Factory<StatsViewModel> {
  private final Provider<LogService> logServiceProvider;

  private final Provider<StorageService> storageServiceProvider;

  public StatsViewModel_Factory(Provider<LogService> logServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    this.logServiceProvider = logServiceProvider;
    this.storageServiceProvider = storageServiceProvider;
  }

  @Override
  public StatsViewModel get() {
    return newInstance(logServiceProvider.get(), storageServiceProvider.get());
  }

  public static StatsViewModel_Factory create(Provider<LogService> logServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    return new StatsViewModel_Factory(logServiceProvider, storageServiceProvider);
  }

  public static StatsViewModel newInstance(LogService logService, StorageService storageService) {
    return new StatsViewModel(logService, storageService);
  }
}
