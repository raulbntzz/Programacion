@extends('layouts.app')

@section('content')
<div class="card">
    <div style="padding: 1%">
        <h2>{{ $producto->nombre }}</h2>
    </div>
    <div class="card-body">
        <p><strong>Descripción:</strong> {{ $producto->descripcion }}</p>
        <p><strong>Precio:</strong> ${{ $producto->precio }}</p>
        <p><strong>Stock:</strong> {{ $producto->stock }}</p>
        <a href="{{ route('productos.index') }}" class="btn btn-primary">Volver al listado</a>
    </div>
</div>
@endsection
