package com.example.makeitso.screens.settings;

import com.example.makeitso.model.service.AccountService;
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
public final class SettingsViewModel_Factory implements Factory<SettingsViewModel> {
  private final Provider<LogService> logServiceProvider;

  private final Provider<AccountService> accountServiceProvider;

  private final Provider<StorageService> storageServiceProvider;

  public SettingsViewModel_Factory(Provider<LogService> logServiceProvider,
      Provider<AccountService> accountServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    this.logServiceProvider = logServiceProvider;
    this.accountServiceProvider = accountServiceProvider;
    this.storageServiceProvider = storageServiceProvider;
  }

  @Override
  public SettingsViewModel get() {
    return newInstance(logServiceProvider.get(), accountServiceProvider.get(), storageServiceProvider.get());
  }

  public static SettingsViewModel_Factory create(Provider<LogService> logServiceProvider,
      Provider<AccountService> accountServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    return new SettingsViewModel_Factory(logServiceProvider, accountServiceProvider, storageServiceProvider);
  }

  public static SettingsViewModel newInstance(LogService logService, AccountService accountService,
      StorageService storageService) {
    return new SettingsViewModel(logService, accountService, storageService);
  }
}
