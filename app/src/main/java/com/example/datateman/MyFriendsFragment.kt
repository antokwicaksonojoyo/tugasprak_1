package com.example.datateman

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friend.*

class MyFriendsFragment : Fragment() {
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman(){
        listTeman= ArrayList()
        listTeman.add(MyFriend(nama = "Antok Nurwicaksono", jkel = "Laki - Laki",
        email = "tanyaantoksaja@gmail.com", telp = "08980044466", alamat = "Malang"))
        listTeman.add(MyFriend(nama = "Joko Sulastro", jkel = "Laki - Laki",
                email = "jokosulas@gmail.com", telp = "08980044477", alamat = "Batu"))
        listTeman.add(MyFriend(nama = "Jaka Dwi Prasetyo", jkel = "Laki - Laki",
                email = "jakadwipras@gmail.com", telp = "08980044499", alamat = "Malang"))
        listTeman.add(MyFriend(nama = "Jaka Mirna F", jkel = "Laki - Laki",
                email = "jakamirnaf@gmail.com", telp = "08980044488", alamat = "Singosari"))
        listTeman.add(MyFriend(nama = "Anggi Maulidita K", jkel = "Perempuan",
                email = "anggimaulidita@gmail.com", telp = "08980044455", alamat = "Malang"))
    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(activity!!, listTeman)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_my_friend, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}