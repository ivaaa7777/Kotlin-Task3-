package com.example.task3_basiccalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var input = ""
        var opera = ""
        var n1 = ""
        var n2 = ""

        buTT1.setOnClickListener{
            if(opera != ""){
                n2 += "1"
                input += "1"
                result.text = input
            }else{
                n1 += "1"
                input += "1"
                result.text = input
            }
        }
        buTT2.setOnClickListener{
            if(opera != ""){
                n2 += "2"
                input += "2"
                result.text = input
            }else{
                n1 += "2"
                input += "2"
                result.text = input
            }
        }
        buTT3.setOnClickListener{
            if(opera != ""){
                n2 += "3"
                input += "3"
                result.text = input
            }else{
                n1 += "3"
                input += "3"
                result.text = input
            }
        }
        buTT4.setOnClickListener{
            if(opera != ""){
                n2 += "4"
                input += "4"
                result.text = input
            }else{
                n1 += "4"
                input += "4"
                result.text = input
            }
        }
        buTT5.setOnClickListener{
            if(opera != ""){
                n2 += "5"
                input += "5"
                result.text = input
            }else{
                n1 += "5"
                input += "5"
                result.text = input
            }
        }
        buTT6.setOnClickListener{
            if(opera != ""){
                n2 += "6"
                input += "6"
                result.text = input
            }else{
                n1 += "6"
                input += "6"
                result.text = input
            }
        }
        buTT7.setOnClickListener{
            if(opera != ""){
                n2 += "7"
                input += "7"
                result.text = input
            }else{
                n1 += "7"
                input += "7"
                result.text = input
            }
        }
        buTT8.setOnClickListener{
            if(opera != ""){
                n2 += "8"
                input += "8"
                result.text = input
            }else{
                n1 += "8"
                input += "8"
                result.text = input
            }
        }
        buTT9.setOnClickListener{
            if(opera != ""){
                n2 += "9"
                input += "9"
                result.text = input
            }else{
                n1 += "9"
                input += "9"
                result.text = input
            }
        }
        buTT0.setOnClickListener{
            if(n1 != "" && opera === ""){
                n1 += "0"
                input += "0"
                result.text = input
            }else if(n1 === "" && opera === ""){
                n1 += "0."
                input += "0."
                result.text = input
            }else if(opera != "" && n2 != ""){
                n2 += "0"
                input += "0"

                result.text = input
            }else if(opera != "" && n2 === ""){
                n2 += "0."
                input += "0."
                result.text = input
            }
        }
        buTTdot.setOnClickListener {
            if(n1 != "" && opera === "" && "." !in n1){
                n1 += "."
                input += "."
                result.text = input
            }else if(opera != "" && n2 != "" && "." !in n2){
                n2 += "."
                input += "."
                result.text = input
            }
        }
        buTTplus.setOnClickListener{
            if(n1 != "" && opera === ""){
                input += "+"
                opera = "+"
                result.text = input
            }
        }
        buTTmin.setOnClickListener{
            if(n1 != "" && opera === ""){
                input += "-"
                opera = "-"
                result.text = input
            }
        }
        buTTdiv.setOnClickListener {
            if(n1 != "" && opera === ""){
                input += "/"
                opera = "/"
                result.text = input
            }
        }
        buTTmult.setOnClickListener {
            if(n1 != "" && opera === ""){
                input += "*"
                opera = "*"
                result.text = input
            }
        }
        buTTrema.setOnClickListener {
            if(n1 != "" && opera === ""){
                input += "%"
                opera = "%"
                result.text = input
            }
        }
        buTTroot.setOnClickListener {
            if(n1 === "" && "√" !in input){
                input += "√"
                opera = "√"
                result.text = input
            }
        }
        buTTnegpos.setOnClickListener{
            if(n1 === "" && opera === "" && "-" !in n1){
                n1 = "-"
                input += "-"
                result.text = input
            }else if(n1 != "" && opera === "" && "-" !in n1){
                n1 = "-" + n1
                input = "-" + input
                result.text = input
            }else if(n2 === "" && opera != "" && "-" !in n2){
                n2 = "-"
                input += "-"
                result.text = input
            }else if(n2 != "" && opera != "" && "-" !in n2){
                n2 = "-" + n2
                input = "-" + input
                result.text = (n1 + opera + n2).toString()
            }else if(n1 === "-" && opera === ""){
                n1 = n1.replace("-","")
                input = (n1 + opera + n2).toString()
                result.text = input
            }else if("-" in n1 && n1 != "" && opera === ""){
                n1 = n1.replace("-","")
                input = (n1 + opera + n2).toString()
                result.text = input
            }else if(n2 === "-" && opera != ""){
                n2 = n2.replace("-","")
                input = (n1 + opera + n2).toString()
                result.text = input
            }else if("-" in n2 && n2 != "" && opera != ""){
                n2 = n2.replace("-","")
                input = (n1 + opera + n2).toString()
                result.text = input
            }
        }
        buTTresult.setOnClickListener {
            if(n1 != "" && n2 != "") {
                if(opera === "+" && "." !in input){
                    result.text = (n1.toInt() + n2.toInt()).toString()
                    n1 = (n1.toInt() + n2.toInt()).toString()
                }else if(opera === "+" && "." in input){
                    result.text = (n1.toFloat() + n2.toFloat()).toString()
                    n1 = (n1.toFloat() + n2.toFloat()).toString()
                }else if(opera === "-" && "." !in input){
                    result.text = (n1.toInt() - n2.toInt()).toString()
                    n1 = (n1.toInt() - n2.toInt()).toString()
                }else if(opera === "-" && "." in input){
                    result.text = (n1.toFloat() - n2.toFloat()).toString()
                    n1 = (n1.toFloat() - n2.toFloat()).toString()
                }else if(opera === "/" && "." !in input){
                    result.text = (n1.toInt() / n2.toInt()).toString()
                    n1 = (n1.toInt() / n2.toInt()).toString()
                }else if(opera === "/" && "." in input){
                    result.text = (n1.toFloat() / n2.toFloat()).toString()
                    n1 = (n1.toFloat() / n2.toFloat()).toString()
                }else if(opera === "*" && "." !in input){
                    result.text = (n1.toInt() * n2.toInt()).toString()
                    n1 = (n1.toInt() * n2.toInt()).toString()
                }else if(opera === "*" && "." in input){
                    result.text = (n1.toFloat() * n2.toFloat()).toString()
                    n1 = (n1.toFloat() * n2.toFloat()).toString()
                }else if(opera === "%" && "." !in input){
                    result.text = (n1.toInt() % n2.toInt()).toString()
                    n1 = (n1.toInt() % n2.toInt()).toString()
                }else if(opera === "%" && "." in input){
                    result.text = (n1.toFloat() % n2.toFloat()).toString()
                    n1 = (n1.toFloat() % n2.toFloat()).toString()
                }
            }else if(opera === "√" && n2 != "" && "." !in n2){
                result.text = sqrt(n2.toFloat()).toString()
                n1 = sqrt(n2.toFloat()).toString()
            }else if(opera === "√" && n2 != "" && "." in n2){
                result.text = sqrt(n2.toFloat()).toString()
                n1 = sqrt(n2.toFloat()).toString()
            }
            n2 = ""
            input = n1
            opera = ""
        }
        buTTrest.setOnClickListener{
            n1 = ""
            n2 = ""
            opera = ""
            input = ""
            result.text = ""
        }
    }
}