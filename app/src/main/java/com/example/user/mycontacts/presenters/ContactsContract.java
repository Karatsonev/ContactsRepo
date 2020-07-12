package com.example.user.mycontacts.presenters;

import com.example.user.mycontacts.views.recyclerview.ContactItemViewHolder;
import com.example.user.mycontacts.models.ContactData;
import java.util.ArrayList;

public interface ContactsContract {

    interface View {

        void navigateToDetails(ContactData contactData);

        void performCall(ContactData contactData);

        void initViews();

    }

    interface Presenter {

        void onViewCreated();

        void setView(ContactsContract.View view);

        ArrayList<ContactData> getContacts();

        ContactItemViewHolder.ContactIemListener getListeners();

    }
}
