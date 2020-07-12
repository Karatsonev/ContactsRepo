package com.example.user.mycontacts.presenters;

import com.example.user.mycontacts.models.ContactData;

public interface EditContactsContract {


    interface View {

        void initViews();

        void loadContactData();

        void onConfirmClicked();

        void onAbortClicked();
    }

    interface Presenter {

        void onViewCreated();

        void setView(EditContactsContract.View view);

        void saveContact(ContactData contactData);

    }
}
