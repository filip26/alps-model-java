import React from 'react'

import { makeStyles } from '@material-ui/core/styles';

import {Controlled as CodeMirror} from 'react-codemirror2'


const useStyles = makeStyles((theme) => ({
  root: {
    fontSize: '16px'
  }
}));

export default function Viewer(props) {

    const classes = useStyles();

    const { mediaType, value } = props;

    const typeToMode = contentType => {

        if (contentType.includes("json")) {
            return { name: "javascript", json: true };
        }
        if (contentType.includes("yaml") || contentType.includes("application/vnd.oai.openapi") || contentType.includes("application/x-asyncapi")) {
            return "yaml";
        }
        if (contentType.includes("xml")) {
            return "xml";
        }
        if (contentType.includes( "html")) {
            return "htmlmixed";
        }
        if (contentType.includes("application/protobuf") || contentType.includes("x-sdl")) {
          return "clike";
        }
        return "text";
    }

    return (
        <CodeMirror
            className={classes.root}
            value={value}
            options={{
                mode: typeToMode(mediaType),
                theme: 'material-darker',
                lineNumbers: false,
                readOnly: 'nocursor',
                }}
            />
            );
}