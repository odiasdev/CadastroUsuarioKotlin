package com.example.cadastrousuario.repository

import android.content.Context
import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.Room
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase
import com.example.cadastrousuario.model.Usuario
import com.example.cadastrousuario.repository.dao.UsuarioDAO

@Database(entities = [Usuario::class], version = 1)
abstract class AppDataBase : RoomDatabase(){
    abstract fun usuarioDAO(): UsuarioDAO // Referência de UsuarioDAO, pois iremos selecionar essa classe por meio da instância do banco

    companion object {
        private lateinit var INSTANCE: AppDataBase

        fun getDataBase(context: Context): AppDataBase {
            if (!::INSTANCE.isInitialized) {
                synchronized(AppDataBase::class) {
                    INSTANCE = Room.databaseBuilder(context, AppDataBase::class.java, "usuariodb")
                        .addMigrations(MIGRATION_1_2, MIGRATION_2_3).allowMainThreadQueries()
                        .build()
                }
            }
            return INSTANCE
        }

        private val MIGRATION_1_2: Migration = object : Migration(1, 2) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(sql = "")
            }
        }

        private val MIGRATION_2_3: Migration = object : Migration(2, 3) {
            override fun migrate(database: SupportSQLiteDatabase) {
                database.execSQL(sql = "")
            }
        }
    }
}