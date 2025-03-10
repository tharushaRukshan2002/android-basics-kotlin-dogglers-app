// Generated by view binder compiler. Do not edit!
package com.example.dogglers.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.dogglers.R;
import com.google.android.material.card.MaterialCardView;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class GridListItemBinding implements ViewBinding {
  @NonNull
  private final MaterialCardView rootView;

  @NonNull
  public final TextView vhAgeTxt;

  @NonNull
  public final TextView vhHobbyTxt;

  @NonNull
  public final ImageView vhListImage;

  @NonNull
  public final TextView vhNameTxt;

  private GridListItemBinding(@NonNull MaterialCardView rootView, @NonNull TextView vhAgeTxt,
      @NonNull TextView vhHobbyTxt, @NonNull ImageView vhListImage, @NonNull TextView vhNameTxt) {
    this.rootView = rootView;
    this.vhAgeTxt = vhAgeTxt;
    this.vhHobbyTxt = vhHobbyTxt;
    this.vhListImage = vhListImage;
    this.vhNameTxt = vhNameTxt;
  }

  @Override
  @NonNull
  public MaterialCardView getRoot() {
    return rootView;
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static GridListItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.grid_list_item, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static GridListItemBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.vh_age_txt;
      TextView vhAgeTxt = ViewBindings.findChildViewById(rootView, id);
      if (vhAgeTxt == null) {
        break missingId;
      }

      id = R.id.vh_hobby_txt;
      TextView vhHobbyTxt = ViewBindings.findChildViewById(rootView, id);
      if (vhHobbyTxt == null) {
        break missingId;
      }

      id = R.id.vh_list_image;
      ImageView vhListImage = ViewBindings.findChildViewById(rootView, id);
      if (vhListImage == null) {
        break missingId;
      }

      id = R.id.vh_name_txt;
      TextView vhNameTxt = ViewBindings.findChildViewById(rootView, id);
      if (vhNameTxt == null) {
        break missingId;
      }

      return new GridListItemBinding((MaterialCardView) rootView, vhAgeTxt, vhHobbyTxt, vhListImage,
          vhNameTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
