<?php

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\VideojuegoController;
use App\Http\Controllers\ConsolaController;
use App\Http\Controllers\CompaniaController;
use App\Http\Controllers\UsuarioController;
use App\Http\Controllers\UsuarioBDController;


Route::get('/user', function (Request $request) {
    return $request->user();
})->middleware('auth:sanctum');

// apiResource a los métodos GET, POST, PUT y DELETE de las clases controller
Route::apiResource('/juego', VideojuegoController::class);

Route::apiResource('/compania', CompaniaController::class);

Route::apiResource('/consola', ConsolaController::class);

Route::apiResource('/usuario', UsuarioController::class);

Route::apiResource('/usuarioBD', UsuarioBDController::class);
