package com.example.makeitso.screens.splash;

import com.example.makeitso.model.service.AccountService;
import com.example.makeitso.model.service.ConfigurationService;
import com.example.makeitso.model.service.LogService;
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
public final class SplashViewModel_Factory implements Factory<SplashViewModel> {
  private final Provider<ConfigurationService> configurationServiceProvider;

  private final Provider<AccountService> accountServiceProvider;

  private final Provider<LogService> logServiceProvider;

  public SplashViewModel_Factory(Provider<ConfigurationService> configurationServiceProvider,
      Provider<AccountService> accountServiceProvider, Provider<LogService> logServiceProvider) {
    this.configurationServiceProvider = configurationServiceProvider;
    this.accountServiceProvider = accountServiceProvider;
    this.logServiceProvider = logServiceProvider;
  }

  @Override
  public SplashViewModel get() {
    return newInstance(configurationServiceProvider.get(), accountServiceProvider.get(), logServiceProvider.get());
  }

  public static SplashViewModel_Factory create(
      Provider<ConfigurationService> configurationServiceProvider,
      Provider<AccountService> accountServiceProvider, Provider<LogService> logServiceProvider) {
    return new SplashViewModel_Factory(configurationServiceProvider, accountServiceProvider, logServiceProvider);
  }

  public static SplashViewModel newInstance(ConfigurationService configurationService,
      AccountService accountService, LogService logService) {
    return new SplashViewModel(configurationService, accountService, logService);
  }
}
