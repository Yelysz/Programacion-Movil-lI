package com.example.makeitso.model.service.module;

import com.google.firebase.auth.FirebaseAuth;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
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
public final class FirebaseModule_AuthFactory implements Factory<FirebaseAuth> {
  @Override
  public FirebaseAuth get() {
    return auth();
  }

  public static FirebaseModule_AuthFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static FirebaseAuth auth() {
    return Preconditions.checkNotNullFromProvides(FirebaseModule.INSTANCE.auth());
  }

  private static final class InstanceHolder {
    private static final FirebaseModule_AuthFactory INSTANCE = new FirebaseModule_AuthFactory();
  }
}
