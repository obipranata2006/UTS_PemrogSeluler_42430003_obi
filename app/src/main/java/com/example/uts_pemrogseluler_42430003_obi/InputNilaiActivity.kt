<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
android:layout_width="match_parent"
android:layout_height="match_parent"
android:orientation="vertical"
android:padding="20dp"
android:gravity="center_horizontal">

<TextView
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:text="INPUT NILAI MAHASISWA"
android:textSize="20sp"
android:textStyle="bold"
android:layout_marginBottom="20dp"/>

<EditText
android:id="@+id/etNama"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Nama Mahasiswa"
android:layout_marginBottom="10dp"/>

<EditText
android:id="@+id/etNilaiTugas"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Nilai Tugas (0-100)"
android:inputType="number"
android:layout_marginBottom="10dp"/>

<EditText
android:id="@+id/etNilaiUTS"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Nilai UTS (0-100)"
android:inputType="number"
android:layout_marginBottom="10dp"/>

<EditText
android:id="@+id/etNilaiUAS"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:hint="Nilai UAS (0-100)"
android:inputType="number"
android:layout_marginBottom="20dp"/>

<Button
android:id="@+id/btnHitung"
android:layout_width="match_parent"
android:layout_height="wrap_content"
android:text="HITUNG NILAI"
android:backgroundTint="#4CAF50"/>

<TextView
android:id="@+id/tvHasil"
android:layout_width="wrap_content"
android:layout_height="wrap_content"
android:layout_marginTop="30dp"
android:text="Hasil akan muncul di sini"
android:textSize="18sp"
android:textStyle="bold"
android:textColor="#2196F3"/>

</LinearLayout>