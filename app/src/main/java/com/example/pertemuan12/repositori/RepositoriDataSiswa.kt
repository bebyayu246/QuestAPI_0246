package com.example.pertemuan12.repositori

import com.example.pertemuan12.apiservice.ServiceApiSiswa
import com.example.pertemuan12.modeldata.DataSiswa
import retrofit2.Response

interface RepositoryDataSiswa {
    suspend fun getDataSiswa(): List<DataSiswa>
    suspend fun postDataSiswa(dataSiswa: DataSiswa) :retrofit2.Response<Void>
}


