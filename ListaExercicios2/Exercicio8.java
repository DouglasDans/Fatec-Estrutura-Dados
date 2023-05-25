ick example on how to use the `npm run` command in the context
of nested workspaces. For a project containing multiple workspaces, e.g:

```
.
+-- package.json
`-- packages
   +-- a
   |   `-- package.json
   `-- b
       `-- package.json
```

By running a command using the `workspace` option, it's possible to run the
given command in the context of that specific workspace. e.g:

```
npm run test --workspace=a
```

This will run the `test` script defined within the
`./packages/a/package.json` file.

Please note that you can also specify this argument multiple times in the
command-line in order to target multiple wo