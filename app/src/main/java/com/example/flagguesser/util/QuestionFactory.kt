package com.example.flagguesser.util

import com.example.flagguesser.R
import com.example.flagguesser.model.Country
import com.example.flagguesser.model.Question

object QuestionFactory {
    private val antarcticaCountries = listOf(
        Country("Antarctica", R.drawable.aq),
        Country("South Georgia and South Sandwich Islands", R.drawable.gs),
        Country("Saint Helena", R.drawable.sh),
        Country("French Southern Territories", R.drawable.tf),
    )

    private val oceaniaCountries = listOf(
        Country("Australia", R.drawable.au),
        Country("Fiji", R.drawable.fj),
        Country("Kiribati", R.drawable.ki),
        Country("Marshall Islands", R.drawable.mh),
        Country("Micronesia", R.drawable.fm),
        Country("Nauru", R.drawable.nr),
        Country("New Zealand", R.drawable.nz),
        Country("Palau", R.drawable.pw),
        Country("Papua New Guinea", R.drawable.pg),
        Country("Samoa", R.drawable.ws),
        Country("Solomon Islands", R.drawable.sb),
        Country("Tonga", R.drawable.to),
        Country("Tuvalu", R.drawable.tv),
        Country("Vanuatu", R.drawable.vu),
        Country("American Samoa", R.drawable.`as`),
        Country("Cocos (Keeling) Islands", R.drawable.cc),
        Country("Christmas Island", R.drawable.cx),
        Country("Cook Islands", R.drawable.ck),
        Country("Guam", R.drawable.gu),
        Country("Northern Mariana Islands", R.drawable.mp),
        Country("New Caledonia", R.drawable.nc),
        Country("Norfolk Island", R.drawable.nf),
        Country("Niue", R.drawable.nu),
        Country("French Polynesia", R.drawable.pf),
        Country("Pitcairn Islands", R.drawable.pn),
        Country("Tokelau", R.drawable.tk),
        Country("Wallis and Futuna", R.drawable.wf),
    )

    private val northAmericanCountries = listOf(
        Country("Canada", R.drawable.ca),
        Country("United States", R.drawable.us),
        Country("Mexico", R.drawable.mx),
        Country("Belize", R.drawable.bz),
        Country("Costa Rica", R.drawable.cr),
        Country("El Salvador", R.drawable.sv),
        Country("Guatemala", R.drawable.gt),
        Country("Honduras", R.drawable.hn),
        Country("Nicaragua", R.drawable.ni),
        Country("Panama", R.drawable.pa),
        Country("Antigua and Barbuda", R.drawable.ag),
        Country("Bahamas", R.drawable.bs),
        Country("Barbados", R.drawable.bb),
        Country("Cuba", R.drawable.cu),
        Country("Dominica", R.drawable.dm),
        Country("Dominican Republic", R.drawable.domc),
        Country("Grenada", R.drawable.gd),
        Country("Haiti", R.drawable.ht),
        Country("Jamaica", R.drawable.jm),
        Country("Saint Kitts and Nevis", R.drawable.kn),
        Country("Saint Lucia", R.drawable.lc),
        Country("Saint Vincent and the Grenadines", R.drawable.vc),
        Country("Trinidad and Tobago", R.drawable.tt),
        Country("Anguilla", R.drawable.ai),
        Country("Saint Barthelemy", R.drawable.bl),
        Country("Bermuda", R.drawable.bm),
        Country("Cayman Islands", R.drawable.ky),
        Country("Martinique", R.drawable.mq),
        Country("Montserrat", R.drawable.ms),
        Country("Saint Martin", R.drawable.sx),
        Country("Turks and Caicos Islands", R.drawable.tc),
        Country("U.S. Virgin Islands", R.drawable.st_vi),
        Country("British Virgin Islands", R.drawable.st_vg),
        Country("Puerto Rico", R.drawable.pr),
        Country("Saint Pierre and Miquelon", R.drawable.pm),
        Country("Guadeloupe", R.drawable.gp),

        )


    private val asianCountries = listOf(
        Country("Afghanistan", R.drawable.af),
        Country("Armenia", R.drawable.am),
        Country("Azerbaijan", R.drawable.az),
        Country("Bahrain", R.drawable.bh),
        Country("Bangladesh", R.drawable.bd),
        Country("Bhutan", R.drawable.bt),
        Country("Brunei", R.drawable.bn),
        Country("Cambodia", R.drawable.kh),
        Country("China", R.drawable.cn),
        Country("Georgia", R.drawable.ge),
        Country("India", R.drawable.`in`),
        Country("Indonesia", R.drawable.id),
        Country("Iran", R.drawable.ir),
        Country("Iraq", R.drawable.iq),
        Country("Israel", R.drawable.il),
        Country("Japan", R.drawable.jp),
        Country("Jordan", R.drawable.jo),
        Country("Kazakhstan", R.drawable.kz),
        Country("Kuwait", R.drawable.kw),
        Country("Kyrgyzstan", R.drawable.kg),
        Country("Laos", R.drawable.la),
        Country("Lebanon", R.drawable.lb),
        Country("Malaysia", R.drawable.my),
        Country("Maldives", R.drawable.mv),
        Country("Mongolia", R.drawable.mn),
        Country("Myanmar (Burma)", R.drawable.mm),
        Country("Nepal", R.drawable.np),
        Country("North Korea", R.drawable.kp),
        Country("Oman", R.drawable.om),
        Country("Pakistan", R.drawable.pk),
        Country("Palestine", R.drawable.ps),
        Country("Philippines", R.drawable.ph),
        Country("Qatar", R.drawable.qa),
        Country("Saudi Arabia", R.drawable.sa),
        Country("Singapore", R.drawable.sg),
        Country("South Korea", R.drawable.kr),
        Country("Sri Lanka", R.drawable.lk),
        Country("Syria", R.drawable.sy),
        Country("Taiwan", R.drawable.tw),
        Country("Tajikistan", R.drawable.tj),
        Country("Thailand", R.drawable.th),
        Country("Timor-Leste", R.drawable.tl),
        Country("Turkey", R.drawable.tr),
        Country("Turkmenistan", R.drawable.tm),
        Country("United Arab Emirates", R.drawable.ae),
        Country("Uzbekistan", R.drawable.uz),
        Country("Vietnam", R.drawable.vn),
        Country("Yemen", R.drawable.ye),
        Country("Macao", R.drawable.mo),
        Country("British Indian Ocean Territory", R.drawable.io),
        Country("Hong Kong", R.drawable.hk),
    )


    private val africanCountries = listOf(
        Country("Algeria", R.drawable.dz),
        Country("Angola", R.drawable.ao),
        Country("Benin", R.drawable.bj),
        Country("Botswana", R.drawable.bw),
        Country("Burkina Faso", R.drawable.bf),
        Country("Burundi", R.drawable.bi),
        Country("Cameroon", R.drawable.cm),
        Country("Cape Verde", R.drawable.cv),
        Country("Central African Republic", R.drawable.cf),
        Country("Chad", R.drawable.td),
        Country("Comoros", R.drawable.km),
        Country("Congo", R.drawable.cg),
        Country("Democratic Republic of the Congo", R.drawable.cd),
        Country("Djibouti", R.drawable.dj),
        Country("Egypt", R.drawable.eg),
        Country("Equatorial Guinea", R.drawable.gq),
        Country("Eritrea", R.drawable.er),
        Country("Ethiopia", R.drawable.et),
        Country("Gabon", R.drawable.ga),
        Country("Gambia", R.drawable.gm),
        Country("Ghana", R.drawable.gh),
        Country("Guinea", R.drawable.gn),
        Country("Guinea-Bissau", R.drawable.gw),
        Country("Ivory Coast", R.drawable.ci),
        Country("Kenya", R.drawable.ke),
        Country("Lesotho", R.drawable.ls),
        Country("Liberia", R.drawable.lr),
        Country("Libya", R.drawable.ly),
        Country("Madagascar", R.drawable.mg),
        Country("Malawi", R.drawable.mw),
        Country("Mali", R.drawable.ml),
        Country("Mauritania", R.drawable.mr),
        Country("Mauritius", R.drawable.mu),
        Country("Morocco", R.drawable.ma),
        Country("Mozambique", R.drawable.mz),
        Country("Namibia", R.drawable.na),
        Country("Niger", R.drawable.ne),
        Country("Nigeria", R.drawable.ng),
        Country("Rwanda", R.drawable.rw),
        Country("Sao Tome and Principe", R.drawable.st),
        Country("Senegal", R.drawable.sn),
        Country("Seychelles", R.drawable.sc),
        Country("Sierra Leone", R.drawable.sl),
        Country("Somalia", R.drawable.so),
        Country("South Africa", R.drawable.za),
        Country("South Sudan", R.drawable.ss),
        Country("Sudan", R.drawable.sd),
        Country("Swaziland", R.drawable.sz),
        Country("Tanzania", R.drawable.tz),
        Country("Togo", R.drawable.tg),
        Country("Tunisia", R.drawable.tn),
        Country("Uganda", R.drawable.ug),
        Country("Zambia", R.drawable.zm),
        Country("Zimbabwe", R.drawable.zw),
        Country("Reunion", R.drawable.re),
        Country("Mayotte", R.drawable.yt)
    )

    private val europeanCountries = listOf(
        Country("Albania", R.drawable.al),
        Country("Andorra", R.drawable.ad),
        Country("Austria", R.drawable.at),
        Country("Aland Islands", R.drawable.ax),
        Country("Belarus", R.drawable.by),
        Country("Belgium", R.drawable.be),
        Country("Bosnia and Herzegovina", R.drawable.ba),
        Country("Bulgaria", R.drawable.bgr),
        Country("Croatia", R.drawable.hr),
        Country("Cyprus", R.drawable.cy),
        Country("Czech Republic", R.drawable.cz),
        Country("Denmark", R.drawable.dk),
        Country("Estonia", R.drawable.ee),
        Country("Faroe Islands", R.drawable.fo),
        Country("Finland", R.drawable.fi),
        Country("France", R.drawable.fr),
        Country("Germany", R.drawable.de),
        Country("Greece", R.drawable.gr),
        Country("Hungary", R.drawable.hu),
        Country("Iceland", R.drawable.`is`),
        Country("Ireland", R.drawable.ie),
        Country("Italy", R.drawable.it),
        Country("Kosovo", R.drawable.xk),
        Country("Latvia", R.drawable.lv),
        Country("Liechtenstein", R.drawable.li),
        Country("Lithuania", R.drawable.lt),
        Country("Luxembourg", R.drawable.lu),
        Country("Malta", R.drawable.mt),
        Country("Moldova", R.drawable.md),
        Country("Monaco", R.drawable.mc),
        Country("Montenegro", R.drawable.me),
        Country("Netherlands", R.drawable.nl),
        Country("North Macedonia", R.drawable.mk),
        Country("Norway", R.drawable.no),
        Country("Poland", R.drawable.pl),
        Country("Portugal", R.drawable.pt),
        Country("Romania", R.drawable.ro),
        Country("Russia", R.drawable.ru),
        Country("San Marino", R.drawable.sm),
        Country("Serbia", R.drawable.rs),
        Country("Slovakia", R.drawable.sk),
        Country("Slovenia", R.drawable.si),
        Country("Spain", R.drawable.es),
        Country("Sweden", R.drawable.se),
        Country("Switzerland", R.drawable.ch),
        Country("Ukraine", R.drawable.ua),
        Country("United Kingdom", R.drawable.gb),
        Country("Vatican City", R.drawable.va),
        Country("England", R.drawable.gb_eng),
        Country("Scotland", R.drawable.gb_sct),
        Country("Northern Ireland", R.drawable.gb_nir),
        Country("Wales", R.drawable.gb_wls),
        Country("Guernsey", R.drawable.gg),
        Country("Gibraltar", R.drawable.gi),
        Country("GreenLands", R.drawable.gl),
        Country("Isle of Man", R.drawable.im),
        Country("Jersey", R.drawable.je),
    )

    private val southAmericanCountries = listOf(
        Country("Argentina", R.drawable.ar),
        Country("Bolivia", R.drawable.bo),
        Country("Brazil", R.drawable.br),
        Country("Chile", R.drawable.cl),
        Country("Colombia", R.drawable.co),
        Country("Ecuador", R.drawable.ec),
        Country("Guyana", R.drawable.gy),
        Country("Paraguay", R.drawable.py),
        Country("Peru", R.drawable.pe),
        Country("Suriname", R.drawable.sr),
        Country("Uruguay", R.drawable.uy),
        Country("Venezuela", R.drawable.ve),
        Country("French Guiana", R.drawable.gf),
        Country("Curaçao", R.drawable.cw),
        Country("Aruba", R.drawable.aw),
        Country("Bonaire", R.drawable.bq),
        Country("Falkland Islands", R.drawable.fk)
    )

    fun createQuestions(
        gameOption: String = "AT", questionAmount: Int = 10, optionCount: Int = 4
    ): List<Question> {
        return when (gameOption) {
            "AF" -> africanCountries.shuffled().take(questionAmount).map { country ->
                createQuestion(country, optionCount, africanCountries)
            }

            "AI" -> asianCountries.shuffled().take(questionAmount).map { country ->
                createQuestion(country, optionCount, asianCountries)
            }

            "AU" -> oceaniaCountries.shuffled().take(questionAmount).map { country ->
                createQuestion(country, optionCount, oceaniaCountries)
            }

            "AT" -> antarcticaCountries.shuffled().take(4).map { country ->
                createQuestion(country, optionCount, antarcticaCountries)
            }

            "EU" -> europeanCountries.shuffled().take(questionAmount).map { country ->
                createQuestion(country, optionCount, europeanCountries)
            }

            "NA" -> northAmericanCountries.shuffled().take(questionAmount).map { country ->
                createQuestion(country, optionCount, northAmericanCountries)
            }

            "SA" -> southAmericanCountries.shuffled().take(questionAmount).map { country ->
                createQuestion(country, optionCount, southAmericanCountries)
            }

            "WO" -> wholeFlag((africanCountries + asianCountries + oceaniaCountries + antarcticaCountries + europeanCountries + northAmericanCountries + southAmericanCountries))

            else -> throw IllegalArgumentException("Invalid game option: $gameOption")
        }
    }

    private fun wholeFlag(worldCountries: List<Country>, optionCount: Int = 4): List<Question> {
        return worldCountries.shuffled().take(worldCountries.size).map { country ->
            createQuestion(country, optionCount, worldCountries)
        }
    }

    private fun createQuestion(
        country: Country, optionCount: Int, allCountries: List<Country>
    ): Question {
        val correctOption = (1..optionCount).random()
        return Question(
            flagImage = country.flagImage,
            correctOption,
            createOptionList(optionCount, correctOption, country, allCountries)
        )
    }

    private fun createOptionList(
        optionCount: Int, correctOption: Int, country: Country, allCountries: List<Country>
    ): List<String> = (allCountries - country).shuffled().take(optionCount - 1).toMutableList()
        .apply { add(correctOption - 1, country) }.map { it.name }

}