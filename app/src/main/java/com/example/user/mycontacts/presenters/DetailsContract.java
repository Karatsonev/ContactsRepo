package com.example.user.mycontacts.presenters;

import com.example.user.mycontacts.models.ContactData;

public interface DetailsContract {

    interface View {

        void initViews();

        void setupButtons();

        void setClickListeners();

        void populateDetailsData();

        ContactData getCurrentContact();

    }

    interface Presenter {

        void onViewCreated();

        void setView(DetailsContract.View view);

        void onSendMessageClicked(ContactData contactData);

        void onSendEmailClicked(ContactData contactData);

        void onPerformCallClicked(ContactData contactData);

        void onEditContactClicked(ContactData contactData);

    }
}
