package com.example.informalbusinessbDictionary

import com.example.informalbusinessbDictionary.Models.Terms

class DataSource {

    companion object {

        fun createData(): ArrayList<Terms> {

            val list = ArrayList<Terms>()

            list.add(
                Terms(
                    1987,
                    "budget",
                    "Orçamento, verba, despesa"
                )
            )

            list.add(
                Terms(
                    1231,
                    "Approach",
                    "Abordagem, aproximação"
                )
            )

            list.add(
                Terms(
                    1790,
                    "soft skills",
                    "aptidões naturais e comportamentais"
                )
            )

            list.add(
                Terms(
                    1547,
                    "hard skills",
                    "aptidões que podem ser aprendidas por meio de qualificações"
                )
            )

            return list

        }

    }
}