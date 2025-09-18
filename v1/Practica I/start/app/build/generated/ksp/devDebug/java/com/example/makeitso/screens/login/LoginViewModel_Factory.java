package com.example.makeitso.screens.login;

import com.example.makeitso.model.service.AccountService;
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
public final class LoginViewModel_Factory implements Factory<LoginViewModel> {
  private final Provider<AccountService> accountServiceProvider;

  private final Provider<LogService> logServiceProvider;

  public LoginViewModel_Factory(Provider<AccountService> accountServiceProvider,
      Provider<LogService> logServiceProvider) {
    this.accountServiceProvider = accountServiceProvider;
    this.logServiceProvider = logServiceProvider;
  }

  @Override
  public LoginViewModel get() {
    return newInstance(accountServiceProvider.get(), logServiceProvider.get());
  }

  public static LoginViewModel_Factory create(Provider<AccountService> accountServiceProvider,
      Provider<LogService> logServiceProvider) {
    return new LoginViewModel_Factory(accountServiceProvider, logServiceProvider);
  }

  public static LoginViewModel newInstance(AccountService accountService, LogService logService) {
    return new LoginViewModel(accountService, logService);
  }
}
