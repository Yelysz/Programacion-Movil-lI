package com.example.makeitso.screens.sign_up;

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
public final class SignUpViewModel_Factory implements Factory<SignUpViewModel> {
  private final Provider<AccountService> accountServiceProvider;

  private final Provider<LogService> logServiceProvider;

  public SignUpViewModel_Factory(Provider<AccountService> accountServiceProvider,
      Provider<LogService> logServiceProvider) {
    this.accountServiceProvider = accountServiceProvider;
    this.logServiceProvider = logServiceProvider;
  }

  @Override
  public SignUpViewModel get() {
    return newInstance(accountServiceProvider.get(), logServiceProvider.get());
  }

  public static SignUpViewModel_Factory create(Provider<AccountService> accountServiceProvider,
      Provider<LogService> logServiceProvider) {
    return new SignUpViewModel_Factory(accountServiceProvider, logServiceProvider);
  }

  public static SignUpViewModel newInstance(AccountService accountService, LogService logService) {
    return new SignUpViewModel(accountService, logService);
  }
}
