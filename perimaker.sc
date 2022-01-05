__config() -> {'stay_loaded' -> false};

__command()->(
    'void' -> _() -> _p0();,
    'worldeater' -> _() -> _p5();
);

_p5()->(
    player=player();

    x=query(player,'x');
    z=query(player,'z');

    x1 = round(x) + 150;
    x2 = round(x) - 150;

    z1 = round(z) + 150;
    z2 = round(z) - 150;

    run('carpet fillUpdates false');
    run('carpet fillLimit 1000000');

    i=-61;
    for(range(5,384),
        i=i+1;

        run('fill '+x1+' '+i+' '+z1+' '+x2+' '+i+' '+z2+' air');

        print('y'+i+' just got removed.');
    );

    print(' ');
    print('--------------------------');
    print(' ');

    run('setblock '+round(x)+' '+64+' '+round(z)+' diamond_block');
    print('Diamond block has been created. at '+round(x)+' 64 '+round(z)+'.');

    print(' ');
    print('--------------------------');
    print(' ');

    run('carpet fillUpdates true');
    run('carpet fillLimit 32768');

    print('All done. Enjoy your new perimeter!');
    print(' ');
    print('--------------------------');
    print(' ');
);

_p0()->(
    player=player();

    x=query(player,'x');
    z=query(player,'z');

    x1 = round(x) + 150;
    x2 = round(x) - 150;

    z1 = round(z) + 150;
    z2 = round(z) - 150;

    run('carpet fillUpdates false');
    run('carpet fillLimit 1000000');

    i=-65;
    for(range(0,384),
        i=i+1;

        run('fill '+x1+' '+i+' '+z1+' '+x2+' '+i+' '+z2+' air');

        print('y'+i+' just got removed.');
    );

    run('fill '+x1+' y6 '+z1+' '+x2+' y6 '+z2+' water');

    print(' ');
    print('--------------------------');
    print(' ');

    run('setblock '+round(x)+' '+64+' '+round(z)+' diamond_block');
    print('Diamond block has been created. at '+round(x)+' 64 '+round(z)+'.');

    print(' ');
    print('--------------------------');
    print(' ');

    run('carpet fillUpdates true');
    run('carpet fillLimit 32768');

    print('All done. Enjoy your new void perimeter!');
    print(' ');
    print('--------------------------');
    print(' ');
);