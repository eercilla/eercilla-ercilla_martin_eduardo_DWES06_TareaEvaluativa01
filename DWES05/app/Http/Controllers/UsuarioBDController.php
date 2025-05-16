<?php

namespace App\Http\Controllers;

use App\Models\usuarioBD;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;

class UsuarioBDController extends Controller
{
    /**
     * Método GET, actúa a modo de pasarela y obtiene los usuarios desde la app Spring Boot
     */
    public function index()
    {

        $response = Http::get('http://localhost:8080/api/usuariosBD');

        return response()->json($response->json(), $response->status());
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Método POST, actúa a modo de pasarela y envía el usuario a la app Spring Boot
     */
    public function store(Request $request)
    {
        $response = Http::post('http://localhost:8080/api/usuariosBD', [
            'nombre' => $request->input('nombre'),
            'email' => $request->input('email'),
        ]);

        return response()->json($response->json(), $response->status());    }

    /**
     * Display the specified resource.
     */
    public function show(usuarioBD $usuarioBD)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(usuarioBD $usuarioBD)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, usuarioBD $usuarioBD)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(usuarioBD $usuarioBD)
    {
        //
    }
}
