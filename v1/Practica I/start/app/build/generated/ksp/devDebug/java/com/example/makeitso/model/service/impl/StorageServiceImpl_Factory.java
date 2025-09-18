package com.example.makeitso.model.service.impl;

import com.example.makeitso.model.service.AccountService;
import com.google.firebase.firestore.FirebaseFirestore;
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
public final class StorageServiceImpl_Factory implements Factory<StorageServiceImpl> {
  private final Provider<FirebaseFirestore> firestoreProvider;

  private final Provider<AccountService> authProvider;

  public StorageServiceImpl_Factory(Provider<FirebaseFirestore> firestoreProvider,
      Provider<AccountService> authProvider) {
    this.firestoreProvider = firestoreProvider;
    this.authProvider = authProvider;
  }

  @Override
  public StorageServiceImpl get() {
    return newInstance(firestoreProvider.get(), authProvider.get());
  }

  public static StorageServiceImpl_Factory create(Provider<FirebaseFirestore> firestoreProvider,
      Provider<AccountService> authProvider) {
    return new StorageServiceImpl_Factory(firestoreProvider, authProvider);
  }

  public static StorageServiceImpl newInstance(FirebaseFirestore firestore, AccountService auth) {
    return new StorageServiceImpl(firestore, auth);
  }
}
