package com.example.makeitso.model.service.impl;

import com.google.firebase.auth.FirebaseAuth;
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
public final class AccountServiceImpl_Factory implements Factory<AccountServiceImpl> {
  private final Provider<FirebaseAuth> authProvider;

  public AccountServiceImpl_Factory(Provider<FirebaseAuth> authProvider) {
    this.authProvider = authProvider;
  }

  @Override
  public AccountServiceImpl get() {
    return newInstance(authProvider.get());
  }

  public static AccountServiceImpl_Factory create(Provider<FirebaseAuth> authProvider) {
    return new AccountServiceImpl_Factory(authProvider);
  }

  public static AccountServiceImpl newInstance(FirebaseAuth auth) {
    return new AccountServiceImpl(auth);
  }
}
