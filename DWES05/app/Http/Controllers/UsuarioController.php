<?php

namespace App\Http\Controllers;

use App\Models\usuario;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;

class UsuarioController extends Controller
{
    /**
     * Método GET, actúa a modo de pasarela y obtiene los usuarios desde la app Spring Boot 
     */
    public function index()
    {
        try {
            $response = Http::get('http://localhost:8080/api/usuarios'); // Llamada al microservicio

            // Si respuesta exitosa
            if ($response->successful()) {
                    return response()->json($response->json(), 200); // Convertimos la respuesta JSON
                } else { // Si respuesta no exitosa
                    return response()->json([
                        'error' => 'Error en la solicitud al microservicio',
                        'status' => $response->status()
                    ], $response->status());
            }
        } catch (\Exception $e) {
            return response()->json([
                'error' => 'No se pudo conectar con el microservicio',
                'message' => $e->getMessage()
            ], 500);
        }
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(usuario $usuario)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(usuario $usuario)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, usuario $usuario)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(usuario $usuario)
    {
        //
    }
}
