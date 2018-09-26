package com.xyz.yaladdit.base

interface ArchContract {
    interface View {}
    interface Presenter<T : View> {
        fun bind(view: T)
        fun unbind()
    }
}