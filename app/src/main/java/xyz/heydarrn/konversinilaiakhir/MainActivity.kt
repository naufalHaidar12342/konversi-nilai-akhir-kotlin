package xyz.heydarrn.konversinilaiakhir

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import xyz.heydarrn.konversinilaiakhir.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMain: ActivityMainBinding
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMain.root)

        bindingMain.buttonHitung.setOnClickListener {
            validasiInput()
        }
    }
    
    private fun validasiInput() {
        bindingMain.apply {
            if (editTextNilaiAkhir.text.isEmpty()){
                editTextNilaiAkhir.error="Nilai akhir harus diisi"
            } else {
                hitungHuruf(editTextNilaiAkhir.text.toString().toInt())
            }
        }
    }

    private fun hitungHuruf(inputNilai: Int) {
        bindingMain.apply {
            when (inputNilai) {
                in 0..50 -> {
                    textNilaiInput.text=getString(
                        R.string.nilai_kamu_template,
                        inputNilai.toString()
                    )
                    Toast.makeText(
                        this@MainActivity,
                        "Selamat! Nilai konversi Anda adalah E",
                        Toast.LENGTH_SHORT
                    ).show()
                    textHasilKonversi.text=getString(
                        R.string.nilai_konversi_template,
                        "E"
                    )
                }
                in 51..65 -> {
                    textNilaiInput.text=getString(
                        R.string.nilai_kamu_template,
                        inputNilai.toString()
                    )
                    Toast.makeText(this@MainActivity,
                        "Selamat! Nilai konversi Anda adalah D",
                        Toast.LENGTH_SHORT
                    ).show()
                    textHasilKonversi.text=getString(
                        R.string.nilai_konversi_template,
                        "D"
                    )
                }
                in 66..70 -> {
                    textNilaiInput.text=getString(
                        R.string.nilai_kamu_template,
                        inputNilai.toString()
                    )
                    Toast.makeText(this@MainActivity,
                        "Selamat! Nilai konversi Anda adalah C",
                        Toast.LENGTH_SHORT
                    ).show()
                    textHasilKonversi.text=getString(
                        R.string.nilai_konversi_template,
                        "C"
                    )
                }
                in 71..79 -> {
                    textNilaiInput.text=getString(
                        R.string.nilai_kamu_template,
                        inputNilai.toString()
                    )
                    Toast.makeText(
                        this@MainActivity,
                        "Selamat! Nilai konversi Anda adalah B",
                        Toast.LENGTH_SHORT
                    ).show()
                    textHasilKonversi.text=getString(
                        R.string.nilai_konversi_template,
                        "B"
                    )
                }
                in 80..100 -> {
                    textNilaiInput.text=getString(
                        R.string.nilai_kamu_template,
                        inputNilai.toString()
                    )
                    Toast.makeText(
                        this@MainActivity,
                        "Selamat! Nilai konversi Anda adalah A",
                        Toast.LENGTH_SHORT
                    ).show()
                    textHasilKonversi.text=getString(
                        R.string.nilai_konversi_template,
                        "A"
                    )
                }

                else -> {
                    editTextNilaiAkhir.error="Nilai yang dimasukkan tidak wajar"
                    Toast.makeText(
                        this@MainActivity,
                        "Nilai yang dimasukkan bukan input yang wajar",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            }

        }

    }
}