package com.example.makeitso.screens.edit_task;

import androidx.lifecycle.SavedStateHandle;
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
public final class EditTaskViewModel_Factory implements Factory<EditTaskViewModel> {
  private final Provider<SavedStateHandle> savedStateHandleProvider;

  private final Provider<LogService> logServiceProvider;

  private final Provider<StorageService> storageServiceProvider;

  public EditTaskViewModel_Factory(Provider<SavedStateHandle> savedStateHandleProvider,
      Provider<LogService> logServiceProvider, Provider<StorageService> storageServiceProvider) {
    this.savedStateHandleProvider = savedStateHandleProvider;
    this.logServiceProvider = logServiceProvider;
    this.storageServiceProvider = storageServiceProvider;
  }

  @Override
  public EditTaskViewModel get() {
    return newInstance(savedStateHandleProvider.get(), logServiceProvider.get(), storageServiceProvider.get());
  }

  public static EditTaskViewModel_Factory create(
      Provider<SavedStateHandle> savedStateHandleProvider, Provider<LogService> logServiceProvider,
      Provider<StorageService> storageServiceProvider) {
    return new EditTaskViewModel_Factory(savedStateHandleProvider, logServiceProvider, storageServiceProvider);
  }

  public static EditTaskViewModel newInstance(SavedStateHandle savedStateHandle,
      LogService logService, StorageService storageService) {
    return new EditTaskViewModel(savedStateHandle, logService, storageService);
  }
}
